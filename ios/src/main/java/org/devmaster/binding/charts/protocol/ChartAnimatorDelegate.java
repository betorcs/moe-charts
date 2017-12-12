package org.devmaster.binding.charts.protocol;


import org.devmaster.binding.charts.ChartAnimator;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ChartAnimatorDelegate")
public interface ChartAnimatorDelegate {
	@Generated
	@Selector("animatorStopped:")
	void animatorStopped(ChartAnimator animator);

	@Generated
	@Selector("animatorUpdated:")
	void animatorUpdated(ChartAnimator animator);
}