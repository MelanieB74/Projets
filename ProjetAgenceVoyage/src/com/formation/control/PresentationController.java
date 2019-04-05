package com.formation.control;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.RateEvent;

@ManagedBean
public class PresentationController implements Serializable {
	
		private static final long serialVersionUID = 1L;
	     
	    private Integer note; 
	    
	    public void onrate(RateEvent rateEvent) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Rate Event", "You rated:" + ((Integer) rateEvent.getRating()).intValue());
	        FacesContext.getCurrentInstance().addMessage(null, message);
	    }
	     
	    public void oncancel() {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cancel Event", "Rate Reset");
	        FacesContext.getCurrentInstance().addMessage(null, message);
	    }
	    

		public Integer getNote() {
	        return note;
	    }
	 
	    public void setNote(Integer note) {
	        this.note = note;
	    }

		@Override
		public String toString() {
			return "PresentationController [note=" + note + "]";
		}

}
