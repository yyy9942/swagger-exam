package cc.eric.swaggerexam.web;

import cc.eric.swaggerexam.domain.Person;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/v1/persons")
    @ApiOperation(value = "사람 정보 조회", notes = "사람 검색 가능")
    public List<Person> searchPerson(@RequestParam(required = false) String name, String age) {
        return Arrays.asList(
            new Person("에릭", LocalDate.of(1995, 12, 27), 27L, "eric.cc@kakaocorp.com"),
                new Person("디노", LocalDate.of(1995, 12, 12), 27L, "dino.dd@kakaocorp.com")
        );
    }

    @GetMapping("/v1/map")
    @ApiOperation(value = "Map으로 하면 어떻게 될까?", notes = "아무것도 안나온다.")
    public List searchMap(@RequestBody Person person) {
        return Arrays.asList(
                new Person("에릭", LocalDate.of(1995, 12, 27), 27L, "eric.cc@kakaocorp.com"),
                new Person("디노", LocalDate.of(1995, 12, 12), 27L, "dino.dd@kakaocorp.com")
        );
    }

}
