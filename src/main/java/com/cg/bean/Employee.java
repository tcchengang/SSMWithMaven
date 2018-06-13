package com.cg.bean;

public class Employee {
    private Integer id;

    private String lastname;

    private String gender;

    private String email;

    private Integer departmentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

	public Employee(Integer id, String lastname, String gender, String email,
			Integer departmentId) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.departmentId = departmentId;
	}
    
	public Employee(){
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastname=" + lastname + ", gender="
				+ gender + ", email=" + email + ", departmentId="
				+ departmentId + "]";
	}
	
}