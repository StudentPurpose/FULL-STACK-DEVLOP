package com.slokam.edu.learning.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slokam.edu.learning.entity.Cls;
import com.slokam.edu.learning.entity.Cls_Sub;
import com.slokam.edu.learning.entity.Subject;
import com.slokam.edu.learning.repo.IClsRepo;
import com.slokam.edu.learning.repo.ICls_subRepo;
import com.slokam.edu.learning.repo.ISub_Repo;

@Service
public class ClsService {

	@Autowired
	private IClsRepo clsRepo;
	
	
	@Autowired
	private ISub_Repo subRepo;
	
	@Autowired
	private ICls_subRepo cls_subRepo;
	
	public List<Subject> getSubjectsByClassname(String name){
		
		return clsRepo.getSubjectsByClassName(name);
	}
	public List<Subject> getAll()
	{
		return clsRepo.getAll();
	}

	  public List<Subject> getSubjectsByClassid(Integer id) { return
	  clsRepo.getSubjectsByClassid(id); }
	 
	 public List<Subject> getSubjectsBySubjectid(Integer id) { return
	 clsRepo.getSubjectsByClassid(id); }
	 //********************************************************************//
	 @Transactional
		public Cls_Sub saveData(String className, String subName) {
			Cls cls = new Cls(); 
			cls.setName(className);
			cls.setDescription(className);
			clsRepo.save(cls);
			
			Subject sub = new Subject();
			sub.setName(subName);
			sub.setDescription(subName);
			subRepo.save(sub);

			Cls_Sub clssub = new Cls_Sub();
			clssub.setCls(cls);
			clssub.setSub(sub);
			cls_subRepo.save(clssub);
			
			return clssub;
		}

	 
	 
}
