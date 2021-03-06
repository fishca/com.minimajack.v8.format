package com.minimajack.v8.metadata.settingsstorages;

import com.minimajack.v8.annotation.V8Class;
import com.minimajack.v8.metadata.external.common.MetaDataInfo;

import java.util.UUID;

@V8Class
public class SettingsStoragesDescriptionBlock {

  public Integer version;
  public MetaDataInfo ssdbi;
  public UUID unk1;
  public UUID unk2;
  public UUID defaultLoadForm;
  public UUID defaultSaveForm;
  public UUID auxiliaryLoadForm;
  public UUID auxiliarySaveForm;
}
