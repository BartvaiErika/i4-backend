import com.example.encoder.Encoder
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation .PostMapping
import org.springframework.web.bind.annotation .RequestBody
import org.springframework.web.bind.annotation .RequestMapping
import org.springframework.web.bind.annotation .RestController

@RestController
@RequestMapping("/encode")
@RequiredArgsConstructor
class EncoderEndpoint {

    private val encoder: Encoder? = null

    @PostMapping
    internal fun encode(@RequestBody message: String): String {
        return encoder!!.encode(message)
    }

}