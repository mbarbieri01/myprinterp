package com.cesaco.myprinterp.client.local.data.model;

import com.cesaco.myprinterp.client.shared.Gruppo;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

public interface GruppoProperties extends PropertyAccess<Gruppo> {
	ModelKeyProvider<Gruppo> abbr();

	LabelProvider<Gruppo> name();
	
	ValueProvider<Gruppo, String> cod_gruppo();
	
	ValueProvider<Gruppo, String> des_gruppo();
}
