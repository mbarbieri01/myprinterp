package com.cesaco.myprinterp.client.shared;

import java.lang.annotation.Annotation;
import javax.validation.ConstraintViolation;
import com.google.gwt.core.client.GWT;
import com.google.gwt.validation.client.impl.GwtBeanDescriptor;
import com.google.gwt.validation.client.impl.GwtValidationContext;
import java.util.HashSet;
import java.lang.IllegalArgumentException;
import java.util.Set;
import javax.validation.ValidationException;

public class _MacchinaValidatorImpl extends com.google.gwt.validation.client.impl.AbstractGwtSpecificValidator<com.cesaco.myprinterp.client.shared.Macchina> implements _MacchinaValidator {
  private static final java.util.List<String> ALL_PROPERTY_NAMES = 
      java.util.Collections.<String>unmodifiableList(
          java.util.Arrays.<String>asList("class","cod_art_gest","cod_macchina","des_macchina","gruppo","id"));
  private final com.google.gwt.validation.client.impl.ConstraintDescriptorImpl<javax.validation.constraints.NotNull> cod_macchina_c0  = 
      com.google.gwt.validation.client.impl.ConstraintDescriptorImpl.<javax.validation.constraints.NotNull> builder()
          .setAnnotation( 
              new javax.validation.constraints.NotNull(){
                  public Class<? extends Annotation> annotationType() {  return javax.validation.constraints.NotNull.class; }
                  public java.lang.Class[] groups() { return new java.lang.Class[] {};}
                  public java.lang.String message() { return "{javax.validation.constraints.NotNull.message}";}
                  public java.lang.Class[] payload() { return new java.lang.Class[] {};}
              }
              )
          .setAttributes(attributeBuilder()
            .put("message", "{javax.validation.constraints.NotNull.message}")
            .put("payload", new java.lang.Class[] {})
            .put("groups", new java.lang.Class[] {})
            .build())
          .setConstraintValidatorClasses(new java.lang.Class[] {org.hibernate.validator.constraints.impl.NotNullValidator.class})
          .setGroups(new java.lang.Class[] {javax.validation.groups.Default.class})
          .setPayload(new java.lang.Class[] {})
          .setReportAsSingleViolation(false)
          .build();
  
  private final javax.validation.metadata.PropertyDescriptor cod_macchina_pd =
      new com.google.gwt.validation.client.impl.PropertyDescriptorImpl(
          "cod_macchina",
          java.lang.String.class,
          false,
          cod_macchina_c0);
  private final com.google.gwt.validation.client.impl.GwtBeanDescriptor<com.cesaco.myprinterp.client.shared.Macchina> beanDescriptor = 
      com.google.gwt.validation.client.impl.GwtBeanDescriptorImpl.builder(com.cesaco.myprinterp.client.shared.Macchina.class)
          .setConstrained(true)
          .put("cod_macchina", cod_macchina_pd)
          .build();
  
  
  public <T> Set<ConstraintViolation<T>> validate(
      GwtValidationContext<T> context,
      com.cesaco.myprinterp.client.shared.Macchina object,
      Class<?>... groups) {
    try {
      Set<ConstraintViolation<T>> violations = 
          new HashSet<ConstraintViolation<T>>();
      context.addValidatedObject(object);
      validateProperty_getcod_macchina(context, violations, object, object.getCod_macchina(), groups);
      validateProperty_cod_macchina(context, violations, object, _cod_macchina(object), groups);
      return violations;
    } catch (IllegalArgumentException e) {
      throw e;
    } catch (ValidationException e) {
      throw e;
    } catch (Exception e) {
      throw new ValidationException("Error validating com.cesaco.myprinterp.client.shared.Macchina", e);
    }
  }
  
  public <T> Set<ConstraintViolation<T>> validateProperty(
      GwtValidationContext<T> context,
      com.cesaco.myprinterp.client.shared.Macchina object,
      String propertyName,
      Class<?>... groups) throws ValidationException {
    try {
      Set<ConstraintViolation<T>> violations = 
          new HashSet<ConstraintViolation<T>>();
      if (propertyName.equals("cod_macchina")) {
        validateProperty_getcod_macchina(context, violations, object, object.getCod_macchina(), groups);
        validateProperty_cod_macchina(context, violations, object, _cod_macchina(object), groups);
      } else  if (!ALL_PROPERTY_NAMES.contains(propertyName)) {
        throw new java.lang.IllegalArgumentException( propertyName +" is not a valid property of com.cesaco.myprinterp.client.shared.Macchina");
      }
      return violations;
    } catch (IllegalArgumentException e) {
      throw e;
    } catch (ValidationException e) {
      throw e;
    } catch (Exception e) {
      throw new ValidationException("Error validating " + propertyName + " of com.cesaco.myprinterp.client.shared.Macchina", e);
    }
  }
  
  public <T> Set<ConstraintViolation<T>> validateValue(
      GwtValidationContext<T> context,
      Class<com.cesaco.myprinterp.client.shared.Macchina> beanType,
      String propertyName,
      Object value,
      Class<?>... groups) {
    try {
      Set<ConstraintViolation<T>> violations = 
          new HashSet<ConstraintViolation<T>>();
      if (propertyName.equals("cod_macchina")) {
        boolean valueTypeMatches = false;
        if ( value == null || value instanceof java.lang.String) {
          valueTypeMatches = true;
          validateProperty_getcod_macchina(context, violations, null, (java.lang.String) value, groups);
        }
        if ( value == null || value instanceof java.lang.String) {
          valueTypeMatches = true;
          validateProperty_cod_macchina(context, violations, null, (java.lang.String) value, groups);
        }
        if(!valueTypeMatches)  {
          throw new ValidationException(value.getClass() +" is not a valid type for "+ propertyName);
        }
      } else  if (!ALL_PROPERTY_NAMES.contains(propertyName)) {
        throw new java.lang.IllegalArgumentException( propertyName +" is not a valid property of com.cesaco.myprinterp.client.shared.Macchina");
      }
      return violations;
    } catch (IllegalArgumentException e) {
      throw e;
    } catch (ValidationException e) {
      throw e;
    } catch (Exception e) {
      throw new ValidationException("Error validating " + propertyName + " of com.cesaco.myprinterp.client.shared.Macchina", e);
    }
  }
  
  public GwtBeanDescriptor<com.cesaco.myprinterp.client.shared.Macchina> getConstraints() {
    return beanDescriptor;
  }
  
  private final <T> void validateProperty_cod_macchina(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      com.cesaco.myprinterp.client.shared.Macchina object,
      final java.lang.String value,
      Class<?>... groups) {
    final GwtValidationContext<T> myContext = context.append("cod_macchina");
    validate(myContext, violations, object, value, new org.hibernate.validator.constraints.impl.NotNullValidator(), cod_macchina_c0, groups);
  }
  
  private final <T> void validateProperty_getcod_macchina(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      com.cesaco.myprinterp.client.shared.Macchina object,
      final java.lang.String value,
      Class<?>... groups) {
    final GwtValidationContext<T> myContext = context.append("cod_macchina");
  }
  
  
  // Write the wrappers after we know which are needed
  private native java.lang.String _cod_macchina(Macchina object) /*-{
    return object.@com.cesaco.myprinterp.client.shared.Macchina::cod_macchina;
  }-*/;
  
  
}
