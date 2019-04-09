package com.formation.control;

import java.util.regex.*;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.*;

@FacesValidator(value="MyValidatorBean")
public class ValidatorBean implements Validator {
	
	 private static final String MAILC_REGEXP =
	    "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	@Override
	public void validate(FacesContext context, UIComponent c, Object val) throws ValidatorException {
		
		String mailC = (String) val;
		Pattern mask = null;
		mask = Pattern.compile(MAILC_REGEXP);
		Matcher matcher = mask.matcher(mailC);
		
		if (!matcher.matches()) {
			FacesMessage message = new FacesMessage();
			message.setDetail("Entrer un email valide");
			message.setSummary("Format de l'email invalide");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	
	}

}
