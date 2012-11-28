/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.cesaco.myprinterp.client.local.images;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ClientBundle.Source;

public interface Resources extends ClientBundle {

  public Resources INSTANCE = GWT.create(Resources.class);

  
  @Source("logo2.png")
  ImageResource logo();
  
  @Source("add16.gif")
  ImageResource add16();

  @Source("add24.gif")
  ImageResource add24();

  @Source("add32.gif")
  ImageResource add32();
  
  @Source("table.png")
  ImageResource table();

  @Source("application_side_list.png")
  ImageResource side_list();
  
  @Source("list.gif")
  ImageResource list();

  @Source("application_form.png")
  ImageResource form();

  @Source("connect.png")
  ImageResource connect();

  @Source("user_add.png")
  ImageResource user_add();

  @Source("user_delete.png")
  ImageResource user_delete();

  @Source("accordion.gif")
  ImageResource accordion();

  @Source("add.gif")
  ImageResource add();

  @Source("delete.gif")
  ImageResource delete();

  @Source("calendar.gif")
  ImageResource calendar();

  @Source("menu-show.gif")
  ImageResource menu_show();

  @Source("list-items.gif")
  ImageResource list_items();

  @Source("album.gif")
  ImageResource album();

  @Source("text.png")
  ImageResource text();

  @Source("plugin.png")
  ImageResource plugin();
  
  @Source("music.png")
  ImageResource music();
  
  
  @Source("user.png")
  ImageResource user();
  
  @Source("user_kid.png")
  ImageResource userKid();
  
  @Source("user_female.png")
  ImageResource userFemale();
  
  @Source("css.png")
  ImageResource css();
  
  @Source("java.png")
  ImageResource java();
  
  @Source("text.png")
  ImageResource json();
  
  @Source("html.png")
  ImageResource html();
  
  @Source("xml.png")
  ImageResource xml();
  
  @Source("folder.png")
  ImageResource folder();
}
