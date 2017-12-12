package org.devmaster.binding.charts.protocol;


import org.devmaster.binding.charts.ChartHighlight;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("IChartHighlighter")
public interface IChartHighlighter {
	@Generated
	@Selector("getHighlightWithX:y:")
	ChartHighlight getHighlightWithXY(@NFloat double x, @NFloat double y);
}