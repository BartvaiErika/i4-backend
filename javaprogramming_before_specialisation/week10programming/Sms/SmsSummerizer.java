package week10programming.Sms;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsSummerizer {

    protected SmsReader smsReader = new SmsReader();
    protected List<Sms> smsList = smsReader.toSMSRecord();

    public Long numberOfMessages() {
        return smsList.stream().count();
    }

    //Which is the ratio between ham and spam sorted by highest first?
    public String getRation() {
        return smsList.stream()
                .collect(Collectors.groupingBy(Sms::getType, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Ham/spam ratio: " + e.getKey() + " " + e.getValue() * 100 / numberOfMessages() + " % ")
                .collect(Collectors.joining());
    }

    //How long is the longest spam message?
    public Optional<Integer> longestSpam() {
        return smsList.stream().filter(e -> e.getType().equals("spam"))
                .mapToInt(e -> e.getMessageText().length())
                .boxed()
                .sorted(Comparator.reverseOrder())
                .findFirst();
    }

    public String getMostUsedHamWord() {
        return smsList.stream()
                .filter(e -> e.getType().equals("ham"))
                .map(e -> e.getMessageText().split(" "))
                .flatMap(strings -> Stream.of(strings))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(stringLongEntry -> "Most used ham word: " + stringLongEntry.getKey())
                .collect(Collectors.joining());
    }

    public String getMostUsedHamLetter() {
        return smsList.stream()
                .filter(e -> e.getType().equals("ham"))
                .map(e -> e.getMessageText().replaceAll(" ", ""))
                .flatMap(e -> Stream.of(e.split("")))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(stringLongEntry -> "Most used ham letter: " + stringLongEntry.getKey())
                .collect(Collectors.joining());
    }

}
