package springboot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import springboot.model.Admin;

@Repository
@Transactional
public interface AdminRepository extends JpaRepository<Admin, Long>{
	
	@Query("SELECT * FROM admin a WHERE a.email = email")
	public List<Admin> pesquisarPorEmail(@Param("email") String email);

}
