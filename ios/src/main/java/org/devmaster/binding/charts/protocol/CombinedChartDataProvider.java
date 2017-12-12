package org.devmaster.binding.charts.protocol;


import org.devmaster.binding.charts.CombinedChartData;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("CombinedChartDataProvider")
@ObjCProtocolName("_TtP6Charts25CombinedChartDataProvider_")
public interface CombinedChartDataProvider extends BarChartDataProvider,
		BubbleChartDataProvider, CandleChartDataProvider,
		LineChartDataProvider, ScatterChartDataProvider {
	@Generated
	@Selector("combinedData")
	CombinedChartData combinedData();
}