package com.springboot.springbootDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class UserControllerTest extends BaseTest{
	  @Test
	    public void login() {
	        try {
	            MvcResult mvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/user/login")
	                   // .param("name", "world")
	                    .accept(MediaType.TEXT_HTML_VALUE))
	                    // .andExpect(MockMvcResultMatchers.status().isOk())             			//等同于Assert.assertEquals(200,status);
	                    // .andExpect(MockMvcResultMatchers.content().string("hello lvgang"))    	//等同于 Assert.assertEquals("hello lvgang",content);
	                    .andDo(MockMvcResultHandlers.print())										//打印出请求和相应的内容
	                    .andExpect(MockMvcResultMatchers.status().isOk())							//返回的状态是200
	                    .andReturn();

	            int status=mvcResult.getResponse().getStatus();                 //得到返回代码
	            String content=mvcResult.getResponse().getContentAsString();    //得到返回结果

	            Assert.assertEquals(200,status);                        //断言，判断返回代码是否正确
	            //Assert.assertEquals("Hello world",content);            //断言，判断返回的值是否正确

	            System.out.println("status=" + status + "||content=" + content);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
