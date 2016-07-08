import javax.faces.bean.ManagedBean;

import com.mooc.domain.Authorization;
import com.mooc.domain.ComitteeMember;
import com.mooc.domain.Trainer;
import com.mooc.domain.University;
import com.mooc.service.ComitteeMemberServiceLocal;
import com.mooc.service.TrainerServiceLocal;
import com.mooc.service.UniversityServiceLocal;

@ManagedBean
public class trainerCmembreBeans {
	private Integer id;
	private String name;
	private String familyName;
	private String phone;
	private String address;
	public Authorization authorization = new Authorization("med@mail.com", "med", "Admin");
	public UniversityServiceLocal universityServiceLocal ;
	public ComitteeMemberServiceLocal comitteeMemberServieLocal;
	public ComitteeMember comitteeMember = comitteeMemberServieLocal.findById(id);
	public TrainerServiceLocal trainerServiceLocal ;
	public Trainer trainer = new Trainer(name, familyName, phone, address, authorization, universityServiceLocal.findById()) ; 
	
	
	public String addTrainer(){
		trainerServiceLocal.create(trainer) ;
		return "trainer/index?faces-redirect=true";
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getFamilyName() {
		return familyName;
	}



	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
}
