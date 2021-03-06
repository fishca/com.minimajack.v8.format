package com.minimajack.v8.metadata.chartsofaccounts;

import com.minimajack.v8.annotation.V8Class;
import com.minimajack.v8.metadata.inner.classes.V8ClassObject;

import java.util.List;

@V8Class
public class ChartsOfAccountsDescription {

  public Integer version;

  public ChartsOfAccountsDescriptionBlock info;

  public List<V8ClassObject> sections;
}
