package org.devmaster.ios.ui

import apple.uikit.UILabel
import apple.uikit.UIViewController
import org.devmaster.binding.charts.*
import org.moe.natj.general.Pointer
import org.moe.natj.general.ann.Owned
import org.moe.natj.general.ann.RegisterOnStartup
import org.moe.natj.objc.ObjCRuntime
import org.moe.natj.objc.ann.IBOutlet
import org.moe.natj.objc.ann.ObjCClassName
import org.moe.natj.objc.ann.Property
import org.moe.natj.objc.ann.Selector

@org.moe.natj.general.ann.Runtime(ObjCRuntime::class)
@ObjCClassName("AppViewController")
@RegisterOnStartup
class AppViewController protected constructor(peer: Pointer) : UIViewController(peer) {

    @Selector("init")
    override external fun init(): AppViewController

    override fun viewDidLoad() {
        super.viewDidLoad()

        titleLabel().setText("My Title")

        updateBarChartView()
    }

    private fun updateBarChartView() {
        val entry1 = BarChartDataEntry.alloc().initWithXY(1.0, 55.0)
        val entry2 = BarChartDataEntry.alloc().initWithXY(2.0, 35.0)
        val entry3 = BarChartDataEntry.alloc().initWithXY(3.0, 68.0)

        val dataSet = BarChartDataSet.alloc().init()
        dataSet.addEntry(entry1)
        dataSet.addEntry(entry2)
        dataSet.addEntry(entry3)


        val data = BarChartData.alloc().initWithDataSet(dataSet)
        barChartView().setData(data)

        val chartDescription = ChartDescription.alloc()
        chartDescription.setText("Bar Chart Description")
        barChartView().setChartDescription(chartDescription)
    }

    @Selector("titleLabel")
    @IBOutlet
    @Property
    external fun titleLabel(): UILabel

    @Selector("barChartView")
    @IBOutlet
    @Property
    external fun barChartView(): BarChartView

    companion object {

        @Owned
        @Selector("alloc")
        @JvmStatic external fun alloc(): AppViewController
    }
}
