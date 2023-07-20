package kr.ezen.jpademo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BbsRepository extends CrudRepository<Bbs, Long> {
//    // 쿼리 메서드 사용
//
//    // SELECT COUNT(*) FROM bbs WHERE wrier = :writer
//    int countAllByWriter(String writer);
//
//    // SELECT * FROM bbs WHERE writer = :writer
//    List<Bbs> findByWriter(String writer);
//
//    // SELECT * FROM bbs WHERE title = :title AND writer = :writer
//    List<Bbs> findByTitleAndWriter(String title, String writer);
//
//    // DELETE FROM bbs WHERE writer = :writer
//    @Transactional
//    int deleteByWriter(String writer);
//
//    // @Query를 이용한 JPQL 작성
//    @Query("SELECT b FROM Bbs b")
//    List<Bbs> findAll();
//
//    @Query("SELECT b FROM Bbs b WHERE b.title = ?1 AND b.writer = ?2")
//    List<Bbs> findByTitleAndWriter2(String title, String writer);
//
//    @Query("SELECT b FROM Bbs b WHERE b.title = :title AND b.writer = :writer")
//    List<Bbs> findByTitleAndWriter3(String title, String writer);
//
//    // native query 작성
//
//    @Query(value = "SELECT * FROM bbs", nativeQuery = true)
//    List<Bbs> findAllBySQL();
//
//    @Query(value = "SELECT title, writer FROM bbs", nativeQuery = true)
//    List<Object[]> findAllByObject();
}
