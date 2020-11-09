package com.param;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.wld.pro.entity.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
* @Description:    读取yaml文件
* @Author:         soso.he
* @CreateDate:     2020-11-09  23:09
* @UpdateUser:     soso.he
* @UpdateDate:     2020-11-09  23:09
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class TestParamdemo {

    @ParameterizedTest
    @MethodSource("testYaml")
    void testCasesWithMethodSource2(User user) {
        System.out.println(user);
        assertTrue(user.getUsername().length()>3);
//        assertTrue(user.getUsername().length()>3&&user.getAge()>30);
    }

    /**
     * 数据驱动，读取yaml文件的测试数据，驱动测试
     * @return
     * @throws IOException
     */
    static List<User> testYaml() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        User user = new User();
        System.out.println(user.toYaml());
        TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
        List<User> users = mapper.readValue(
                TestParamdemo.class.getResourceAsStream("/user.yaml"),
//                TestParamdemo.class.getResourceAsStream("/user.json"),
                typeReference
        );

        return users;
    }
}
