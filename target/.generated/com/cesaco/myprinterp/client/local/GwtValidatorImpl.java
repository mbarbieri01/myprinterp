package com.cesaco.myprinterp.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.validation.client.impl.GwtBeanDescriptor;
import com.google.gwt.validation.client.impl.GwtSpecificValidator;
import com.google.gwt.validation.client.impl.GwtValidationContext;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.metadata.BeanDescriptor;

public class GwtValidatorImpl extends com.google.gwt.validation.client.impl.AbstractGwtValidator implements com.cesaco.myprinterp.client.local.KitchenSinkValidatorFactory.GwtValidator {
  public GwtValidatorImpl() {
    super(javax.validation.groups.Default.class);
  }
  
  public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups) {
    checkNotNull(object, "object");
    checkNotNull(groups, "groups");
    checkGroups(groups);
    if (object instanceof com.cesaco.myprinterp.client.shared.Member) {
      GwtValidationContext<T> context = new GwtValidationContext<T>(
          (Class<T>) com.cesaco.myprinterp.client.shared.Member.class, 
          object, 
          com.cesaco.myprinterp.client.shared._MemberValidator.INSTANCE.getConstraints(), 
          getMessageInterpolator(), 
          this);
      return com.cesaco.myprinterp.client.shared._MemberValidator.INSTANCE
          .validate(context, (com.cesaco.myprinterp.client.shared.Member) object, groups);
    }
    if (object instanceof com.cesaco.myprinterp.client.shared.Gruppo) {
      GwtValidationContext<T> context = new GwtValidationContext<T>(
          (Class<T>) com.cesaco.myprinterp.client.shared.Gruppo.class, 
          object, 
          com.cesaco.myprinterp.client.shared._GruppoValidator.INSTANCE.getConstraints(), 
          getMessageInterpolator(), 
          this);
      return com.cesaco.myprinterp.client.shared._GruppoValidator.INSTANCE
          .validate(context, (com.cesaco.myprinterp.client.shared.Gruppo) object, groups);
    }
    if (object instanceof com.cesaco.myprinterp.client.shared.Macchina) {
      GwtValidationContext<T> context = new GwtValidationContext<T>(
          (Class<T>) com.cesaco.myprinterp.client.shared.Macchina.class, 
          object, 
          com.cesaco.myprinterp.client.shared._MacchinaValidator.INSTANCE.getConstraints(), 
          getMessageInterpolator(), 
          this);
      return com.cesaco.myprinterp.client.shared._MacchinaValidator.INSTANCE
          .validate(context, (com.cesaco.myprinterp.client.shared.Macchina) object, groups);
    }
    throw new IllegalArgumentException("KitchenSinkValidatorFactory.GwtValidator can not  validate "+ object.getClass().getName()+ ". "
        + "Valid types are [com.cesaco.myprinterp.client.shared.Member, com.cesaco.myprinterp.client.shared.Gruppo, com.cesaco.myprinterp.client.shared.Macchina]");
  }
  
  public <T> Set<ConstraintViolation<T>> validateProperty(T object,String propertyName, Class<?>... groups) {
    checkNotNull(object, "object");
    checkNotNull(propertyName, "propertyName");
    checkNotNull(groups, "groups");
    checkGroups(groups);
    if (object instanceof com.cesaco.myprinterp.client.shared.Member) {
      GwtValidationContext<T> context = new GwtValidationContext<T>(
          (Class<T>) com.cesaco.myprinterp.client.shared.Member.class, 
          object, 
          com.cesaco.myprinterp.client.shared._MemberValidator.INSTANCE.getConstraints(), 
          getMessageInterpolator(), 
          this);
      return com.cesaco.myprinterp.client.shared._MemberValidator.INSTANCE
          .validateProperty(context, (com.cesaco.myprinterp.client.shared.Member) object, propertyName, groups);
    }
    if (object instanceof com.cesaco.myprinterp.client.shared.Gruppo) {
      GwtValidationContext<T> context = new GwtValidationContext<T>(
          (Class<T>) com.cesaco.myprinterp.client.shared.Gruppo.class, 
          object, 
          com.cesaco.myprinterp.client.shared._GruppoValidator.INSTANCE.getConstraints(), 
          getMessageInterpolator(), 
          this);
      return com.cesaco.myprinterp.client.shared._GruppoValidator.INSTANCE
          .validateProperty(context, (com.cesaco.myprinterp.client.shared.Gruppo) object, propertyName, groups);
    }
    if (object instanceof com.cesaco.myprinterp.client.shared.Macchina) {
      GwtValidationContext<T> context = new GwtValidationContext<T>(
          (Class<T>) com.cesaco.myprinterp.client.shared.Macchina.class, 
          object, 
          com.cesaco.myprinterp.client.shared._MacchinaValidator.INSTANCE.getConstraints(), 
          getMessageInterpolator(), 
          this);
      return com.cesaco.myprinterp.client.shared._MacchinaValidator.INSTANCE
          .validateProperty(context, (com.cesaco.myprinterp.client.shared.Macchina) object, propertyName, groups);
    }
    throw new IllegalArgumentException("KitchenSinkValidatorFactory.GwtValidator can not  validate "+ object.getClass().getName()+ ". "
        + "Valid types are [com.cesaco.myprinterp.client.shared.Member, com.cesaco.myprinterp.client.shared.Gruppo, com.cesaco.myprinterp.client.shared.Macchina]");
  }
  
  public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value, Class<?>... groups) {
    checkNotNull(beanType, "beanType");
    checkNotNull(propertyName, "propertyName");
    checkNotNull(groups, "groups");
    checkGroups(groups);
    if (beanType.equals(com.cesaco.myprinterp.client.shared.Member.class)) {
      GwtValidationContext<T> context = new GwtValidationContext<T>(
          (Class<T>) com.cesaco.myprinterp.client.shared.Member.class, 
          null, 
          com.cesaco.myprinterp.client.shared._MemberValidator.INSTANCE.getConstraints(), 
          getMessageInterpolator(), 
          this);
      return com.cesaco.myprinterp.client.shared._MemberValidator.INSTANCE
          .validateValue(context, (Class<com.cesaco.myprinterp.client.shared.Member>)beanType, propertyName, value, groups);
    }
    if (beanType.equals(com.cesaco.myprinterp.client.shared.Gruppo.class)) {
      GwtValidationContext<T> context = new GwtValidationContext<T>(
          (Class<T>) com.cesaco.myprinterp.client.shared.Gruppo.class, 
          null, 
          com.cesaco.myprinterp.client.shared._GruppoValidator.INSTANCE.getConstraints(), 
          getMessageInterpolator(), 
          this);
      return com.cesaco.myprinterp.client.shared._GruppoValidator.INSTANCE
          .validateValue(context, (Class<com.cesaco.myprinterp.client.shared.Gruppo>)beanType, propertyName, value, groups);
    }
    if (beanType.equals(com.cesaco.myprinterp.client.shared.Macchina.class)) {
      GwtValidationContext<T> context = new GwtValidationContext<T>(
          (Class<T>) com.cesaco.myprinterp.client.shared.Macchina.class, 
          null, 
          com.cesaco.myprinterp.client.shared._MacchinaValidator.INSTANCE.getConstraints(), 
          getMessageInterpolator(), 
          this);
      return com.cesaco.myprinterp.client.shared._MacchinaValidator.INSTANCE
          .validateValue(context, (Class<com.cesaco.myprinterp.client.shared.Macchina>)beanType, propertyName, value, groups);
    }
    throw new IllegalArgumentException("KitchenSinkValidatorFactory.GwtValidator can not  validate "+ beanType.getName()+ ". "
        + "Valid types are [com.cesaco.myprinterp.client.shared.Member, com.cesaco.myprinterp.client.shared.Gruppo, com.cesaco.myprinterp.client.shared.Macchina]");
  }
  
  public BeanDescriptor getConstraintsForClass(Class<?> clazz) {
    checkNotNull(clazz, "clazz");
    if (clazz.equals(com.cesaco.myprinterp.client.shared.Member.class)) {
      return com.cesaco.myprinterp.client.shared._MemberValidator.INSTANCE.getConstraints();
    }
    if (clazz.equals(com.cesaco.myprinterp.client.shared.Gruppo.class)) {
      return com.cesaco.myprinterp.client.shared._GruppoValidator.INSTANCE.getConstraints();
    }
    if (clazz.equals(com.cesaco.myprinterp.client.shared.Macchina.class)) {
      return com.cesaco.myprinterp.client.shared._MacchinaValidator.INSTANCE.getConstraints();
    }
    throw new IllegalArgumentException("KitchenSinkValidatorFactory.GwtValidator can not  validate "+ clazz.getName()+ ". "
        + "Valid types are [com.cesaco.myprinterp.client.shared.Member, com.cesaco.myprinterp.client.shared.Gruppo, com.cesaco.myprinterp.client.shared.Macchina]");
  }
  
  public <T> Set<ConstraintViolation<T>> validate(GwtValidationContext<T> context,
      Object object, Class<?>... groups) {
    checkNotNull(context, "context");
    checkNotNull(object, "object");
    checkNotNull(groups, "groups");
    checkGroups(groups);
    if (object instanceof com.cesaco.myprinterp.client.shared.Member) {
      return com.cesaco.myprinterp.client.shared._MemberValidator.INSTANCE
          .validate(context, (com.cesaco.myprinterp.client.shared.Member) object, groups);
    }
    if (object instanceof com.cesaco.myprinterp.client.shared.Macchina) {
      return com.cesaco.myprinterp.client.shared._MacchinaValidator.INSTANCE
          .validate(context, (com.cesaco.myprinterp.client.shared.Macchina) object, groups);
    }
    if (object instanceof com.cesaco.myprinterp.client.shared.Gruppo) {
      return com.cesaco.myprinterp.client.shared._GruppoValidator.INSTANCE
          .validate(context, (com.cesaco.myprinterp.client.shared.Gruppo) object, groups);
    }
    throw new IllegalArgumentException("KitchenSinkValidatorFactory.GwtValidator can not  validate "+ object.getClass().getName()+ ". "
        + "Valid types are [com.cesaco.myprinterp.client.shared.Member, com.cesaco.myprinterp.client.shared.Gruppo, com.cesaco.myprinterp.client.shared.Macchina]");
  }
}
