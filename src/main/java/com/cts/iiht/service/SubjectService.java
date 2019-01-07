package com.cts.iiht.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.iiht.dao.SubjectRepository;
import com.cts.iiht.model.Subject;

@Service
@Transactional
public class SubjectService {
	
	@Autowired
	SubjectRepository subjectRepository;
	
	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}
	
	public void deleteSubject(long id) {
		subjectRepository.deleteById(id);
	}

	public Subject searchSubject(long id) {
		Optional<Subject> optSub = subjectRepository.findById(id);
		if(optSub.isPresent()) {
			return optSub.get();
		}
		else {
			return null;
		}
	}
}
