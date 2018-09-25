package com.google.common.hash;

import com.google.common.hash.AbstractNonStreamingHashFunction;
import com.google.common.hash.HashCode;

public class AlwaysOneHashFunction extends AbstractNonStreamingHashFunction {

	@Override
	public int bits() { 
		return 64;
	}

	@Override
	public HashCode hashBytes(byte[] arg0, int arg1, int arg2) {
		return HashCode.fromLong(1);
	}

}
