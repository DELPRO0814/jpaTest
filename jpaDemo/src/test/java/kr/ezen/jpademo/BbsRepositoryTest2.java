package kr.ezen.jpademo;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BbsRepositoryTest2 {
    @Autowired
    private BbsRepository bbsRepository;

//    @BeforeEach
//    public void dummyData() {
//        for (int i = 1; i <= 100; i++) {
//            Bbs bbs = new Bbs();
//            bbs.setBno((long) i);
//            bbs.setTitle("title" + i);
//            bbs.setContent("content" + i);
//            bbs.setWriter("writer" + (i % 10));
//            bbs.setViewCnt((long) (Math.random() * 100));
//            bbs.setRegDate(new Date());
//            bbs.setUpDate(new Date());
//            bbsRepository.save(bbs);
//        }
//    }
//
//    @Test
//    public void countTest() {
//        assertTrue(bbsRepository.countAllByWriter("writer7") == 10);
//    }
//
//    @Test
//    public void findTest() {
//        List<Bbs> list = bbsRepository.findByWriter("writer3");
//        assertTrue(list.size() == 10);
//        list.forEach(System.out::println);
////        list.forEach((li) -> System.out.println(li));
//    }
//
//    @Test
//    public void titleAndWriter() {
//        List<Bbs> list = bbsRepository.findByTitleAndWriter("title2", "writer2");
//        assertTrue(list.size() == 1);
//        list.forEach(System.out::println);
//    }
//
//    @Test
//    public void deleteTest() {
//        assertTrue(bbsRepository.deleteByWriter("writer4") == 10);
//        List<Bbs> list = bbsRepository.findByWriter("writer4");
//        assertTrue(list.size() == 0);
//    }
}