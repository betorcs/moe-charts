package org.devmaster.binding.charts.protocol;


import org.devmaster.binding.charts.ChartAxisBase;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("IChartAxisValueFormatter")
public interface IChartAxisValueFormatter {
	@Generated
	@Selector("stringForValue:axis:")
	String stringForValueAxis(double value, ChartAxisBase axis);
}