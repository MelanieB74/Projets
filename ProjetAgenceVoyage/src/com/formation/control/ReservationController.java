package com.formation.control;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;

import com.formation.domain.Client;
import com.formation.domain.Reservation;

@ManagedBean
@ViewScoped
public class ReservationController implements Serializable {
	
	private static final long serialVersionUID = 1L;
 
    private Reservation reservation = new Reservation();
    private Client client = new Client();
     
    private boolean skip;
     
    public Reservation getReservation() {
        return reservation;
    }
 
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
         
    public Client getClient() {
         return client;
    }
     
    public void setClient(Client client) {
         this.client = client;
    }
     
    public void save() {        
        FacesMessage msg = new FacesMessage("Votre réservation a été enregistrée avec succès", "Bon Voyage !");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
}
