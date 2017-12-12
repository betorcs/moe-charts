package org.devmaster.binding.charts.protocol;


import org.devmaster.binding.charts.ChartDataEntry;
import org.devmaster.binding.charts.ChartViewPortHandler;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("IChartValueFormatter")
public interface IChartValueFormatter {
	@Generated
	@Selector("stringForValue:entry:dataSetIndex:viewPortHandler:")
	String stringForValueEntryDataSetIndexViewPortHandler(double value,
			ChartDataEntry entry, @NInt long dataSetIndex,
			ChartViewPortHandler viewPortHandler);
}