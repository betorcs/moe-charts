package org.devmaster.binding.charts.protocol;


import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGPoint;
import apple.uikit.UIColor;
import org.devmaster.binding.charts.ChartViewPortHandler;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("IShapeRenderer")
@ObjCProtocolName("_TtP6Charts14IShapeRenderer_")
public interface IShapeRenderer {
	@Generated
	@Selector("renderShapeWithContext:dataSet:viewPortHandler:point:color:")
	void renderShapeWithContextDataSetViewPortHandlerPointColor(
			CGContextRef context,
			@Mapped(ObjCObjectMapper.class) IScatterChartDataSet dataSet,
			ChartViewPortHandler viewPortHandler, @ByValue CGPoint point,
			UIColor color);
}