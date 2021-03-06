package com.wefine.mybatis.service;

import com.wefine.mybatis.entity.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressServiceTest {

    @Autowired
    private AddressService service;

    @Test
    public void testInsert() {
        Address address = new Address();
        address.setCity("HK");
        address.setCountry("CN");
        address.setState("HK");
        address.setStreet("TLW 1234 street");
        address.setZip("32884");

        service.insert(address);

        System.out.println(address);
    }

    @Test
    public void testPaging() {
        List<Address> list = service.paging(1, 2);
        System.out.println("====");

        list.forEach(System.out::println);

        System.out.println("====");
    }
}
