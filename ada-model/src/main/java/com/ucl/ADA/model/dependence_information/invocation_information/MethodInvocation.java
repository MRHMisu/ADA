package com.ucl.ADA.model.dependence_information.invocation_information;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "METHOD_INVOCATION")
public class MethodInvocation extends ElementInvocation {

    /**
     * The list of parameters which have been passes to the method on invocation.
     */
    @Transient
    private List<PassedParameter> passedParameters = new ArrayList<>();

    /**
     * The constructor of the method invocation object.
     * @param name name of the constructor being invoked
     * @param passedParameters The list of parameters with which the constructor has been invoked with, possibly null if it is empty
     */
    public MethodInvocation(String name, List<PassedParameter> passedParameters) {
        super(name);
        if (passedParameters != null) {
            this.passedParameters.addAll(passedParameters);
        }
    }
}
