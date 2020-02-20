package net.mamoe.mirai.console.graphical.model

import javafx.beans.property.SimpleObjectProperty
import net.mamoe.mirai.Bot
import tornadofx.*

class BotModel(val uin: Long) {
    val botProperty = SimpleObjectProperty<Bot>(null)
    var bot: Bot by botProperty

    val logHistory = observableListOf<String>()
    val admins = observableListOf<Long>()
}

class BotViewModel(botModel: BotModel? = null) : ItemViewModel<BotModel>(botModel) {
    val bot = bind(BotModel::botProperty)
    val logHistory = bind(BotModel::logHistory)
    val admins = bind(BotModel::admins)
}