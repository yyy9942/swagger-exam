package cc.eric.swaggerexam.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder @Getter @AllArgsConstructor
public class Person {
    @ApiModelProperty(example = "정준")
    private String name;
    @ApiModelProperty(example = "2021-12-27")
    private LocalDate birthday;
    @ApiModelProperty(example = "27")
    private long age;
    @ApiModelProperty(example = "eric.cc@kakaocorp.com", name = "이메일")
    private String email;
}
