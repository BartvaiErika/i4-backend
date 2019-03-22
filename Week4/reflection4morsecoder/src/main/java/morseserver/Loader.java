package morseserver;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//
//@Getter
//@Setter
//@Component
//@ConfigurationProperties("translation")
//public class Loader {
//        List<Encoder> encoder;
//
//        public Map<String, String> getMessage() {
//            return encoder.stream().
//                    collect(Collectors.toMap(Encoder::getSymbol,Encoder::getMorsecode));
//        }
//}
