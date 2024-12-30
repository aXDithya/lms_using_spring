package com.adithya.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adithya.lms.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
	

}
