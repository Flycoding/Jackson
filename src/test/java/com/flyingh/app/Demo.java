package com.flyingh.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.flyingh.vo.*;
import com.google.common.collect.ImmutableMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class Demo {
    private static ObjectMapper mapper;

    @BeforeClass
    public static void beforeClass() {
        mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        mapper.disable(MapperFeature.USE_ANNOTATIONS);
//        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
    }

    @AfterClass
    public static void afterClass() {
        mapper = null;
    }

    @Test
    public void test25() throws JsonProcessingException {
        final User8 u8 = new User8(1, new User8.Name("a", "b"));
        System.out.println(mapper.addMixIn(User8.Name.class, MixinUser8Name.class).writeValueAsString(u8));
    }

    @Test
    public void test24() throws JsonProcessingException {
        System.out.println(mapper.writeValueAsString(new User7(1, 22, "a")));
        System.out.println(mapper.writeValueAsString(new User7(1, "a")));
        System.out.println(mapper.writeValueAsString(new User7(1, 22)));
    }

    @Test
    public void test23() throws JsonProcessingException {
        final Worker3 worker3 = new Worker3(1, "flyingh", 35000);
        final SimpleFilterProvider filterProvider = new SimpleFilterProvider().addFilter("salaryFilter", SimpleBeanPropertyFilter.serializeAllExcept("salary"));
        System.out.println(mapper.writer(filterProvider).withDefaultPrettyPrinter().writeValueAsString(worker3));
    }

    @Test
    public void test22() throws JsonProcessingException {
        final Order2 order = new Order2();
        order.setId(1);
        final OrderItem2 i1 = new OrderItem2(1, "i1", order);
        final OrderItem2 i2 = new OrderItem2(2, "i2", order);
        final OrderItem2 i3 = new OrderItem2(3, "i3", order);
        order.setItems(Arrays.asList(i1, i2, i3));
        System.out.println(mapper.writeValueAsString(order));
        System.out.println("##################");
        System.out.println(mapper.writeValueAsString(i1));
        System.out.println(mapper.writeValueAsString(i2));
        System.out.println(mapper.writeValueAsString(i3));
    }

    @Test
    public void test21() throws JsonProcessingException {
        final Order order = new Order();
        order.setId(1);
        final OrderItem i1 = new OrderItem(1, "i1", order);
        final OrderItem i2 = new OrderItem(2, "i2", order);
        final OrderItem i3 = new OrderItem(3, "i3", order);
        order.setItems(Arrays.asList(i1, i2, i3));
        System.out.println(mapper.writeValueAsString(order));
        System.out.println(mapper.writeValueAsString(i1));
        System.out.println(mapper.writeValueAsString(i2));
        System.out.println(mapper.writeValueAsString(i3));
    }

    @Test
    public void test20() throws JsonProcessingException {
        final Worker2 worker2 = new Worker2(1, "flyingh", 35000);
        System.out.println(mapper.writerWithView(Worker2.View.Public.class).writeValueAsString(worker2));
    }

    @Test
    public void test19() throws IOException {
        final User6 u6 = new User6(1, new User6.Name("a", "b"));
        final String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u6);
        System.out.println(json);
        final User6 user6 = mapper.readValue(json, User6.class);
        System.out.println(user6);
    }

    @Test
    public void test18() throws JsonProcessingException {
        System.out.println(mapper.writer().withDefaultPrettyPrinter().writeValueAsString(new Event("e", new Date())));
    }

    @Test
    public void test17() throws IOException {
        final String json = mapper.writeValueAsString(new User5(1, "flyingh"));
        System.out.println(json);
        final User5 u5 = mapper.readValue(json, User5.class);
        System.out.println(u5);
    }

    @Test
    public void test16() throws IOException {
        final Zoo zoo = new Zoo(new Zoo.Dog("dog", "dd"));
        final String json = mapper.writeValueAsString(zoo);
        System.out.println(json);
        final Zoo z = mapper.readValue("{\"animal\":{\"type\":\"cat\",\"name\":\"cc\",\"c\":\"ccc\"}}", Zoo.class);
        System.out.println(z);
    }

    @Test
    public void test15() throws IOException {
        final User4 user4 = new User4(1, "flyingh");
        final String json = mapper.writeValueAsString(user4);
        System.out.println(json);
        final User4 u4 = mapper.readValue(json, User4.class);
        System.out.println(u4);
    }

    @Test
    public void test14() throws JsonProcessingException {
        final User3 user3 = new User3(1, null);
        System.out.println(mapper.writeValueAsString(user3));
    }


    @Test
    public void test13() throws IOException {
        final User2 user2 = mapper.readValue("{\"id\":1,\"name\":{\"firstName\":\"a\",\"lastName\":\"b\"}}", User2.class);
        System.out.println(user2);
    }

    @Test
    public void test12() throws IOException {
        final Person3 person3 = mapper.readValue("{\"id\":1,\"name\":\"flyingh\"}", Person3.class);
        System.out.println(person3);
    }

    @Test
    public void test11() throws IOException {
        final Person2 person2 = mapper.readValue("{\"id\":1,\"name\":\"flyingh\"}", Person2.class);
        System.out.println(person2);
    }

    @Test
    public void test10() throws IOException {
        final Stu stu = mapper.readValue("{\"id\":1,\"name\":\"flyingh\"}", Stu.class);
        System.out.println(stu);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stu));
    }

    @Test
    public void test9() throws IOException {
        final Work work = mapper.reader(new InjectableValues.Std().addValue(int.class, 1)).forType(Work.class).readValue("{\"name\":\"java\"}");
        System.out.println(work);
        final Work work2 = mapper.reader(new InjectableValues.Std().addValue(int.class, 1)).forType(Work.class).readValue("{\"my_name\":\"java\"}");
        System.out.println(work2);
    }

    @Test
    public void test8() throws IOException {
        final Worker worker = mapper.readValue("{\"id\":1,\"my_name\":\"flyingh\"}", Worker.class);
        System.out.println(worker);
    }

    @Test
    public void test7() throws IOException {
        final Teacher teacher = new Teacher(1, "icoding", Date.from(Instant.now()));
        final String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(teacher);
        System.out.println(str);
        final Teacher t = mapper.readValue(str, Teacher.class);
        System.out.println(t);
    }

    @Test
    public void test6() throws JsonProcessingException {
        final Book book = new Book(1, "Java");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book));
    }

    @Test
    public void test5() throws JsonProcessingException {
        final Per per = new Per(1, "flyingh", Gender.MALE);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(per));
    }

    @Test
    public void test4() throws JsonProcessingException {
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(new Student(1, "{\n" +
                "  \"info\": {\n" +
                "    \"name\": \"icoding\",\n" +
                "    \"age\": 22\n" +
                "  }\n" +
                "}")));
    }

    @Test
    public void test3() throws JsonProcessingException {
        final User user = new User(1, "flyingh");
        System.out.println(mapper.writeValueAsString(user));
    }

    @Test
    public void test2() throws IOException {
        final Person person = mapper.readValue("{\"id\":1,\"name\":\"flyingh\",\"age\":\"22\"}", Person.class);
        System.out.println(person);
    }

    @Test
    public void test() throws JsonProcessingException {
        final Person person = new Person(1, ImmutableMap.of("name", "flyingh", "age", "22"));
        System.out.println(mapper.writeValueAsString(person));
    }

    @Test
    public void test0() throws JsonProcessingException {
        Worker4 worker4 = new Worker4(1, "flyingh", 35000);
        System.out.println(mapper.writer().withDefaultPrettyPrinter().writeValueAsString(worker4));
    }

}
