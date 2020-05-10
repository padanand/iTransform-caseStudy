package com.ondemand.car.wash.services;

import com.ondemand.car.wash.entity.Profile;

public interface IProfile {

	public String createProfile (Profile profile);

	public Profile findUser(Profile loginDetail);
}
