package kr.ezen.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    @Autowired
    EntityManagerFactory emf;

    public static void main(String[] args) {
//		SpringApplication.run(JpaDemoApplication.class, args);
//		System.out.println("spring boot!!");
        SpringApplication app = new SpringApplication(JpaDemoApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run();

    }

   @Override
    public void run(String... args) throws Exception {
        /*System.out.println("emf = " + emf);
        EntityManager em = emf.createEntityManager();

        Customer customer = new Customer();
        customer.setId("test");
        customer.setPassword("1234");
        customer.setName("홍길동");
        customer.setEmail("asdf@qwer.zxc");
        customer.setInDate(new Date());
        customer.setUpDate(new Date());

        EntityTransaction tx = em.getTransaction();

        tx.begin();
        // 저장
        em.persist(customer);
        // 수정
        customer.setName("박길동");
        customer.setEmail("aaaaa@aaa.com");
        customer.setUpDate(new Date());
        em.persist(customer);
        tx.commit();
        // 조회
        Customer customer2 = em.find(Customer.class, "test");
        System.out.println("customer == customer2 = " + (customer == customer2));
        Customer customer3 = em.find(Customer.class, "demo");
        // demo가 엔티티 매니저 안에 없기 때문에 DB를 조회
        System.out.println("customer3 = " + customer3);

        tx.begin();
        //삭제
        em.remove(customer);
        tx.commit();*/
    }
}
