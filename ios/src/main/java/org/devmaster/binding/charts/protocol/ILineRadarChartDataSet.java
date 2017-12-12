package org.devmaster.binding.charts.protocol;


import apple.uikit.UIColor;
import org.devmaster.binding.charts.ChartFill;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("ILineRadarChartDataSet")
@ObjCProtocolName("_TtP6Charts22ILineRadarChartDataSet_")
public interface ILineRadarChartDataSet extends
		ILineScatterCandleRadarChartDataSet {
	@Generated
	@Selector("drawFilledEnabled")
	boolean drawFilledEnabled();

	@Generated
	@Selector("fill")
	ChartFill fill();

	@Generated
	@Selector("fillAlpha")
	@NFloat
	double fillAlpha();

	@Generated
	@Selector("fillColor")
	UIColor fillColor();

	@Generated
	@Selector("isDrawFilledEnabled")
	boolean isDrawFilledEnabled();

	@Generated
	@Selector("lineWidth")
	@NFloat
	double lineWidth();

	@Generated
	@Selector("setDrawFilledEnabled:")
	void setDrawFilledEnabled(boolean value);

	@Generated
	@Selector("setFill:")
	void setFill(ChartFill value);

	@Generated
	@Selector("setFillAlpha:")
	void setFillAlpha(@NFloat double value);

	@Generated
	@Selector("setFillColor:")
	void setFillColor(UIColor value);

	@Generated
	@Selector("setLineWidth:")
	void setLineWidth(@NFloat double value);
}