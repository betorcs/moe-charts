package org.devmaster.binding.charts.protocol;


import apple.coregraphics.struct.CGPoint;
import org.devmaster.binding.charts.ChartData;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("ChartDataProvider")
@ObjCProtocolName("_TtP6Charts17ChartDataProvider_")
public interface ChartDataProvider {
	@Generated
	@Selector("centerOffsets")
	@ByValue
	CGPoint centerOffsets();

	@Generated
	@Selector("chartXMax")
	double chartXMax();

	@Generated
	@Selector("chartXMin")
	double chartXMin();

	@Generated
	@Selector("chartYMax")
	double chartYMax();

	@Generated
	@Selector("chartYMin")
	double chartYMin();

	@Generated
	@Selector("data")
	ChartData data();

	@Generated
	@Selector("maxHighlightDistance")
	@NFloat
	double maxHighlightDistance();

	@Generated
	@Selector("maxVisibleCount")
	@NInt
	long maxVisibleCount();

	@Generated
	@Selector("xRange")
	double xRange();
}