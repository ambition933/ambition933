package demo.controller;


import demo.common.Result;
import demo.entity.UserVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/user")
@Validated
public class JiaoyanController {
    //这是7/15号新增内容
    @GetMapping("/get")
    public Result getid(@RequestParam("id") @Min(message = "参数必须大于1", value = 1) Integer id) {

        return Result.success(id);

    }

    @PostMapping("/add")
    public Result add(@RequestBody @Valid UserVO userVO) {

        return Result.success(userVO);
    }

}

