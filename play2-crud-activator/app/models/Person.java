package models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.utils.dao.BasicModel;

import java.util.Date;

@Entity
@SuppressWarnings("serial")
public class Person extends Model implements BasicModel<Long> {

    @Id
	private Long key;

	@Basic
	@Required
	private String name;
    
    @Basic
    @Required
    private String cnpj;
    
    @Basic
    @Required
    private Date dateBirth;
    
	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Date getDateBirth() {
        return this.dateBirth;
    }
    
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

	@Override
	public String toString() {
		return "Simple [key=" + key + ", name=" + name + "]";
	}
}
