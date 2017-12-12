package org.devmaster.binding.charts.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("Charts")
@Runtime(CRuntime.class)
public final class Charts {
	static {
		NatJ.register();
	}

	@Generated
	private Charts() {
	}

	@Generated
	@CVariable()
	public static native double ChartsVersionNumber();

	@Generated
	@CVariable()
	public static native ConstBytePtr ChartsVersionString();
}