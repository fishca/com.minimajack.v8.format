package com.minimajack.v8.metadata.subsystems;

import com.minimajack.v8.annotation.V8Class;
import com.minimajack.v8.metadata.inner.classes.V8ClassObject;

import java.util.List;

@V8Class
public class SubsystemsDescription {

  public Integer version;

  public SubsystemsDescriptionBlock info;

  public List<V8ClassObject> sections;
}
