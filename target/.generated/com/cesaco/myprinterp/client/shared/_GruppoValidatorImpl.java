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

public class _GruppoValidatorImpl extends com.google.gwt.validation.client.impl.AbstractGwtSpecificValidator<com.cesaco.myprinterp.client.shared.Gruppo> implements _GruppoValidator {
  private static final java.util.List<String> ALL_PROPERTY_NAMES = 
      java.util.Collections.<String>unmodifiableList(
          java.util.Arrays.<String>asList("abbr","class","cod_gruppo","des_gruppo","id","macchine","name"));
  private final com.google.gwt.validation.client.impl.ConstraintDescriptorImpl<javax.validation.constraints.NotNull> cod_gruppo_c0  = 
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
  
  private final javax.validation.metadata.PropertyDescriptor cod_gruppo_pd =
      new com.google.gwt.validation.client.impl.PropertyDescriptorImpl(
          "cod_gruppo",
          java.lang.String.class,
          false,
          cod_gruppo_c0);
  private final com.google.gwt.validation.client.impl.ConstraintDescriptorImpl<javax.validation.constraints.Size> des_gruppo_c0  = 
      com.google.gwt.validation.client.impl.ConstraintDescriptorImpl.<javax.validation.constraints.Size> builder()
          .setAnnotation( 
              new javax.validation.constraints.Size(){
                  public Class<? extends Annotation> annotationType() {  return javax.validation.constraints.Size.class; }
                  public java.lang.Class[] groups() { return new java.lang.Class[] {};}
                  public int min() { return 5;}
                  public int max() { return 20;}
                  public java.lang.String message() { return "{javax.validation.constraints.Size.message}";}
                  public java.lang.Class[] payload() { return new java.lang.Class[] {};}
              }
              )
          .setAttributes(attributeBuilder()
            .put("message", "{javax.validation.constraints.Size.message}")
            .put("min", 5)
            .put("payload", new java.lang.Class[] {})
            .put("max", 20)
            .put("groups", new java.lang.Class[] {})
            .build())
          .setConstraintValidatorClasses(new java.lang.Class[] {org.hibernate.validator.constraints.impl.SizeValidatorForString.class,org.hibernate.validator.constraints.impl.SizeValidatorForCollection.class,org.hibernate.validator.constraints.impl.SizeValidatorForArray.class,org.hibernate.validator.constraints.impl.SizeValidatorForMap.class,org.hibernate.validator.constraints.impl.SizeValidatorForArraysOfBoolean.class,org.hibernate.validator.constraints.impl.SizeValidatorForArraysOfByte.class,org.hibernate.validator.constraints.impl.SizeValidatorForArraysOfChar.class,org.hibernate.validator.constraints.impl.SizeValidatorForArraysOfDouble.class,org.hibernate.validator.constraints.impl.SizeValidatorForArraysOfFloat.class,org.hibernate.validator.constraints.impl.SizeValidatorForArraysOfInt.class,org.hibernate.validator.constraints.impl.SizeValidatorForArraysOfLong.class})
          .setGroups(new java.lang.Class[] {javax.validation.groups.Default.class})
          .setPayload(new java.lang.Class[] {})
          .setReportAsSingleViolation(false)
          .build();
  
  private final com.google.gwt.validation.client.impl.ConstraintDescriptorImpl<javax.validation.constraints.NotNull> des_gruppo_c1  = 
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
  
  private final javax.validation.metadata.PropertyDescriptor des_gruppo_pd =
      new com.google.gwt.validation.client.impl.PropertyDescriptorImpl(
          "des_gruppo",
          java.lang.String.class,
          false,
          des_gruppo_c0,
          des_gruppo_c1);
  private final com.google.gwt.validation.client.impl.GwtBeanDescriptor<com.cesaco.myprinterp.client.shared.Gruppo> beanDescriptor = 
      com.google.gwt.validation.client.impl.GwtBeanDescriptorImpl.builder(com.cesaco.myprinterp.client.shared.Gruppo.class)
          .setConstrained(true)
          .put("cod_gruppo", cod_gruppo_pd)
          .put("des_gruppo", des_gruppo_pd)
          .build();
  
  
  public <T> Set<ConstraintViolation<T>> validate(
      GwtValidationContext<T> context,
      com.cesaco.myprinterp.client.shared.Gruppo object,
      Class<?>... groups) {
    try {
      Set<ConstraintViolation<T>> violations = 
          new HashSet<ConstraintViolation<T>>();
      context.addValidatedObject(object);
      validateProperty_getcod_gruppo(context, violations, object, object.getCod_gruppo(), groups);
      validateProperty_cod_gruppo(context, violations, object, _cod_gruppo(object), groups);
      validateProperty_getdes_gruppo(context, violations, object, object.getDes_gruppo(), groups);
      validateProperty_des_gruppo(context, violations, object, _des_gruppo(object), groups);
      return violations;
    } catch (IllegalArgumentException e) {
      throw e;
    } catch (ValidationException e) {
      throw e;
    } catch (Exception e) {
      throw new ValidationException("Error validating com.cesaco.myprinterp.client.shared.Gruppo", e);
    }
  }
  
  public <T> Set<ConstraintViolation<T>> validateProperty(
      GwtValidationContext<T> context,
      com.cesaco.myprinterp.client.shared.Gruppo object,
      String propertyName,
      Class<?>... groups) throws ValidationException {
    try {
      Set<ConstraintViolation<T>> violations = 
          new HashSet<ConstraintViolation<T>>();
      if (propertyName.equals("cod_gruppo")) {
        validateProperty_getcod_gruppo(context, violations, object, object.getCod_gruppo(), groups);
        validateProperty_cod_gruppo(context, violations, object, _cod_gruppo(object), groups);
      } else if (propertyName.equals("des_gruppo")) {
        validateProperty_getdes_gruppo(context, violations, object, object.getDes_gruppo(), groups);
        validateProperty_des_gruppo(context, violations, object, _des_gruppo(object), groups);
      } else  if (!ALL_PROPERTY_NAMES.contains(propertyName)) {
        throw new java.lang.IllegalArgumentException( propertyName +" is not a valid property of com.cesaco.myprinterp.client.shared.Gruppo");
      }
      return violations;
    } catch (IllegalArgumentException e) {
      throw e;
    } catch (ValidationException e) {
      throw e;
    } catch (Exception e) {
      throw new ValidationException("Error validating " + propertyName + " of com.cesaco.myprinterp.client.shared.Gruppo", e);
    }
  }
  
  public <T> Set<ConstraintViolation<T>> validateValue(
      GwtValidationContext<T> context,
      Class<com.cesaco.myprinterp.client.shared.Gruppo> beanType,
      String propertyName,
      Object value,
      Class<?>... groups) {
    try {
      Set<ConstraintViolation<T>> violations = 
          new HashSet<ConstraintViolation<T>>();
      if (propertyName.equals("cod_gruppo")) {
        boolean valueTypeMatches = false;
        if ( value == null || value instanceof java.lang.String) {
          valueTypeMatches = true;
          validateProperty_getcod_gruppo(context, violations, null, (java.lang.String) value, groups);
        }
        if ( value == null || value instanceof java.lang.String) {
          valueTypeMatches = true;
          validateProperty_cod_gruppo(context, violations, null, (java.lang.String) value, groups);
        }
        if(!valueTypeMatches)  {
          throw new ValidationException(value.getClass() +" is not a valid type for "+ propertyName);
        }
      } else if (propertyName.equals("des_gruppo")) {
        boolean valueTypeMatches = false;
        if ( value == null || value instanceof java.lang.String) {
          valueTypeMatches = true;
          validateProperty_getdes_gruppo(context, violations, null, (java.lang.String) value, groups);
        }
        if ( value == null || value instanceof java.lang.String) {
          valueTypeMatches = true;
          validateProperty_des_gruppo(context, violations, null, (java.lang.String) value, groups);
        }
        if(!valueTypeMatches)  {
          throw new ValidationException(value.getClass() +" is not a valid type for "+ propertyName);
        }
      } else  if (!ALL_PROPERTY_NAMES.contains(propertyName)) {
        throw new java.lang.IllegalArgumentException( propertyName +" is not a valid property of com.cesaco.myprinterp.client.shared.Gruppo");
      }
      return violations;
    } catch (IllegalArgumentException e) {
      throw e;
    } catch (ValidationException e) {
      throw e;
    } catch (Exception e) {
      throw new ValidationException("Error validating " + propertyName + " of com.cesaco.myprinterp.client.shared.Gruppo", e);
    }
  }
  
  public GwtBeanDescriptor<com.cesaco.myprinterp.client.shared.Gruppo> getConstraints() {
    return beanDescriptor;
  }
  
  private final <T> void validateProperty_cod_gruppo(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      com.cesaco.myprinterp.client.shared.Gruppo object,
      final java.lang.String value,
      Class<?>... groups) {
    final GwtValidationContext<T> myContext = context.append("cod_gruppo");
    validate(myContext, violations, object, value, new org.hibernate.validator.constraints.impl.NotNullValidator(), cod_gruppo_c0, groups);
  }
  
  private final <T> void validateProperty_getcod_gruppo(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      com.cesaco.myprinterp.client.shared.Gruppo object,
      final java.lang.String value,
      Class<?>... groups) {
    final GwtValidationContext<T> myContext = context.append("cod_gruppo");
  }
  
  private final <T> void validateProperty_des_gruppo(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      com.cesaco.myprinterp.client.shared.Gruppo object,
      final java.lang.String value,
      Class<?>... groups) {
    final GwtValidationContext<T> myContext = context.append("des_gruppo");
    validate(myContext, violations, object, value, new org.hibernate.validator.constraints.impl.SizeValidatorForString(), des_gruppo_c0, groups);
    validate(myContext, violations, object, value, new org.hibernate.validator.constraints.impl.NotNullValidator(), des_gruppo_c1, groups);
  }
  
  private final <T> void validateProperty_getdes_gruppo(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      com.cesaco.myprinterp.client.shared.Gruppo object,
      final java.lang.String value,
      Class<?>... groups) {
    final GwtValidationContext<T> myContext = context.append("des_gruppo");
  }
  
  
  // Write the wrappers after we know which are needed
  private native java.lang.String _des_gruppo(Gruppo object) /*-{
    return object.@com.cesaco.myprinterp.client.shared.Gruppo::des_gruppo;
  }-*/;
  
  private native java.lang.String _cod_gruppo(Gruppo object) /*-{
    return object.@com.cesaco.myprinterp.client.shared.Gruppo::cod_gruppo;
  }-*/;
  
  
}
