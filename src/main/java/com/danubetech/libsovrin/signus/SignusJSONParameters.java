package com.danubetech.libsovrin.signus;

import com.danubetech.libsovrin.SovrinJava;

/**
 * signus.rs JSON parameters
 */
public final class SignusJSONParameters {

	private SignusJSONParameters() {

	}

	public static class CreateAndStoreMyDidJSONParameter extends SovrinJava.JsonParameter {

		public CreateAndStoreMyDidJSONParameter(String did, String seed, String cryptoType) {

			if (did != null) this.map.put("did", did);
			if (seed != null) this.map.put("seed", seed);
			if (cryptoType != null) this.map.put("crypto_type", cryptoType);
		}
	}
}