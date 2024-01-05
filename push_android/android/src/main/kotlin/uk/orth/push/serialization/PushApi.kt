// Autogenerated from Pigeon (v16.0.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package uk.orth.push.serialization

import android.util.Log
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MessageCodec
import io.flutter.plugin.common.StandardMessageCodec
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

private fun wrapResult(result: Any?): List<Any?> {
  return listOf(result)
}

private fun wrapError(exception: Throwable): List<Any?> {
  if (exception is FlutterError) {
    return listOf(
      exception.code,
      exception.message,
      exception.details
    )
  } else {
    return listOf(
      exception.javaClass.simpleName,
      exception.toString(),
      "Cause: " + exception.cause + ", Stacktrace: " + Log.getStackTraceString(exception)
    )
  }
}

private fun createConnectionError(channelName: String): FlutterError {
  return FlutterError("channel-error",  "Unable to establish connection on channel: '$channelName'.", "")}

/**
 * Error class for passing custom error details to Flutter via a thrown PlatformException.
 * @property code The error code.
 * @property message The error message.
 * @property details The error details. Must be a datatype supported by the api codec.
 */
class FlutterError (
  val code: String,
  override val message: String? = null,
  val details: Any? = null
) : Throwable()

/**
 * # iOS UN (UserNotification) symbols
 *
 * Dart/Flutter translation of the iOS permissions API. In a future release,
 * we may replace this API with a consistent API for all platforms that require
 * permissions to show notifications to the user.
 * UNAuthorizationStatus: Constants indicating whether the app is allowed to
 * schedule notifications.
 *
 * See the [Apple documentation](https://developer.apple.com/documentation/usernotifications/unnotificationsettings/1648391-authorizationstatus) for more information
 */
enum class UNAuthorizationStatus(val raw: Int) {
  NOTDETERMINED(0),
  DENIED(1),
  AUTHORIZED(2),
  PROVISIONAL(3),
  EPHEMERAL(4);

  companion object {
    fun ofRaw(raw: Int): UNAuthorizationStatus? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/**
 * The type of notification the user will see
 *
 * See the [Apple documentation](https://developer.apple.com/documentation/usernotifications/unalertstyle) for more information
 */
enum class UNAlertStyle(val raw: Int) {
  NONE(0),
  BANNER(1),
  ALERT(2);

  companion object {
    fun ofRaw(raw: Int): UNAlertStyle? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/**
 * The current configuration of a notification setting
 *
 * See the [Apple documentation](https://developer.apple.com/documentation/usernotifications/unnotificationsetting) for more information
 */
enum class UNNotificationSetting(val raw: Int) {
  NOTSUPPORTED(0),
  DISABLED(1),
  ENABLED(2);

  companion object {
    fun ofRaw(raw: Int): UNNotificationSetting? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/**
 * Conditions to show/reveal notification content to the user
 *
 * See the [Apple documentation](https://developer.apple.com/documentation/usernotifications/unshowpreviewssetting) for more information
 */
enum class UNShowPreviewsSetting(val raw: Int) {
  ALWAYS(0),
  WHENAUTHENTICATED(1),
  NEVER(2);

  companion object {
    fun ofRaw(raw: Int): UNShowPreviewsSetting? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class RemoteMessage (
  val notification: Notification? = null,
  val data: Map<String?, Any?>? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): RemoteMessage {
      val notification: Notification? = (list[0] as List<Any?>?)?.let {
        Notification.fromList(it)
      }
      val data = list[1] as Map<String?, Any?>?
      return RemoteMessage(notification, data)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      notification?.toList(),
      data,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class Notification (
  val title: String? = null,
  val body: String? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): Notification {
      val title = list[0] as String?
      val body = list[1] as String?
      return Notification(title, body)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      title,
      body,
    )
  }
}

/**
 * The object for reading notification-related settings and the authorization status of your app.
 *
 * See the [Apple documentation](https://developer.apple.com/documentation/usernotifications/unnotificationsettings) for more information
 *
 * Generated class from Pigeon that represents data sent in messages.
 */
data class UNNotificationSettings (
  val authorizationStatus: UNAuthorizationStatus? = null,
  val soundSetting: UNNotificationSetting? = null,
  val badgeSetting: UNNotificationSetting? = null,
  val alertSetting: UNNotificationSetting? = null,
  val notificationCenterSetting: UNNotificationSetting? = null,
  val lockScreenSetting: UNNotificationSetting? = null,
  val carPlaySetting: UNNotificationSetting? = null,
  val alertStyle: UNAlertStyle? = null,
  val showPreviewsSetting: UNShowPreviewsSetting? = null,
  val criticalAlertSetting: UNNotificationSetting? = null,
  val providesAppNotificationSettings: Boolean? = null,
  val announcementSetting: UNNotificationSetting? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): UNNotificationSettings {
      val authorizationStatus: UNAuthorizationStatus? = (list[0] as Int?)?.let {
        UNAuthorizationStatus.ofRaw(it)
      }
      val soundSetting: UNNotificationSetting? = (list[1] as Int?)?.let {
        UNNotificationSetting.ofRaw(it)
      }
      val badgeSetting: UNNotificationSetting? = (list[2] as Int?)?.let {
        UNNotificationSetting.ofRaw(it)
      }
      val alertSetting: UNNotificationSetting? = (list[3] as Int?)?.let {
        UNNotificationSetting.ofRaw(it)
      }
      val notificationCenterSetting: UNNotificationSetting? = (list[4] as Int?)?.let {
        UNNotificationSetting.ofRaw(it)
      }
      val lockScreenSetting: UNNotificationSetting? = (list[5] as Int?)?.let {
        UNNotificationSetting.ofRaw(it)
      }
      val carPlaySetting: UNNotificationSetting? = (list[6] as Int?)?.let {
        UNNotificationSetting.ofRaw(it)
      }
      val alertStyle: UNAlertStyle? = (list[7] as Int?)?.let {
        UNAlertStyle.ofRaw(it)
      }
      val showPreviewsSetting: UNShowPreviewsSetting? = (list[8] as Int?)?.let {
        UNShowPreviewsSetting.ofRaw(it)
      }
      val criticalAlertSetting: UNNotificationSetting? = (list[9] as Int?)?.let {
        UNNotificationSetting.ofRaw(it)
      }
      val providesAppNotificationSettings = list[10] as Boolean?
      val announcementSetting: UNNotificationSetting? = (list[11] as Int?)?.let {
        UNNotificationSetting.ofRaw(it)
      }
      return UNNotificationSettings(authorizationStatus, soundSetting, badgeSetting, alertSetting, notificationCenterSetting, lockScreenSetting, carPlaySetting, alertStyle, showPreviewsSetting, criticalAlertSetting, providesAppNotificationSettings, announcementSetting)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      authorizationStatus?.raw,
      soundSetting?.raw,
      badgeSetting?.raw,
      alertSetting?.raw,
      notificationCenterSetting?.raw,
      lockScreenSetting?.raw,
      carPlaySetting?.raw,
      alertStyle?.raw,
      showPreviewsSetting?.raw,
      criticalAlertSetting?.raw,
      providesAppNotificationSettings,
      announcementSetting?.raw,
    )
  }
}

@Suppress("UNCHECKED_CAST")
private object PushHostApiCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          Notification.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          RemoteMessage.fromList(it)
        }
      }
      130.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          UNNotificationSettings.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?)   {
    when (value) {
      is Notification -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is RemoteMessage -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      is UNNotificationSettings -> {
        stream.write(130)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/** Generated interface from Pigeon that represents a handler of messages from Flutter. */
interface PushHostApi {
  /**
   * Returns null if it doesn't exist.
   * See [PushFlutterApi.onNotificationTap] to understand why a RemoteMessage is not provided here.
   */
  fun getNotificationTapWhichLaunchedTerminatedApp(): Map<String?, Any?>?
  fun getToken(callback: (Result<String>) -> Unit)
  fun backgroundFlutterApplicationReady()
  fun onListenToOnNewToken()
  fun onCancelToOnNewToken()
  /**
   * Pass true for the option you want permission to use
   * Returns true if permission was granted.
   */
  fun requestPermission(badge: Boolean, sound: Boolean, alert: Boolean, carPlay: Boolean, criticalAlert: Boolean, provisional: Boolean, providesAppNotificationSettings: Boolean, announcement: Boolean, callback: (Result<Boolean>) -> Unit)
  fun getNotificationSettings(callback: (Result<UNNotificationSettings>) -> Unit)
  fun areNotificationsEnabled(callback: (Result<Boolean>) -> Unit)

  companion object {
    /** The codec used by PushHostApi. */
    val codec: MessageCodec<Any?> by lazy {
      PushHostApiCodec
    }
    /** Sets up an instance of `PushHostApi` to handle messages through the `binaryMessenger`. */
    @Suppress("UNCHECKED_CAST")
    fun setUp(binaryMessenger: BinaryMessenger, api: PushHostApi?) {
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.push_platform_interface.PushHostApi.getNotificationTapWhichLaunchedTerminatedApp", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped: List<Any?>
            try {
              wrapped = listOf<Any?>(api.getNotificationTapWhichLaunchedTerminatedApp())
            } catch (exception: Throwable) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.push_platform_interface.PushHostApi.getToken", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            api.getToken() { result: Result<String> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.push_platform_interface.PushHostApi.backgroundFlutterApplicationReady", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped: List<Any?>
            try {
              api.backgroundFlutterApplicationReady()
              wrapped = listOf<Any?>(null)
            } catch (exception: Throwable) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.push_platform_interface.PushHostApi.onListenToOnNewToken", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped: List<Any?>
            try {
              api.onListenToOnNewToken()
              wrapped = listOf<Any?>(null)
            } catch (exception: Throwable) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.push_platform_interface.PushHostApi.onCancelToOnNewToken", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped: List<Any?>
            try {
              api.onCancelToOnNewToken()
              wrapped = listOf<Any?>(null)
            } catch (exception: Throwable) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.push_platform_interface.PushHostApi.requestPermission", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val badgeArg = args[0] as Boolean
            val soundArg = args[1] as Boolean
            val alertArg = args[2] as Boolean
            val carPlayArg = args[3] as Boolean
            val criticalAlertArg = args[4] as Boolean
            val provisionalArg = args[5] as Boolean
            val providesAppNotificationSettingsArg = args[6] as Boolean
            val announcementArg = args[7] as Boolean
            api.requestPermission(badgeArg, soundArg, alertArg, carPlayArg, criticalAlertArg, provisionalArg, providesAppNotificationSettingsArg, announcementArg) { result: Result<Boolean> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.push_platform_interface.PushHostApi.getNotificationSettings", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            api.getNotificationSettings() { result: Result<UNNotificationSettings> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.push_platform_interface.PushHostApi.areNotificationsEnabled", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            api.areNotificationsEnabled() { result: Result<Boolean> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
    }
  }
}
@Suppress("UNCHECKED_CAST")
private object PushFlutterApiCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          Notification.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          RemoteMessage.fromList(it)
        }
      }
      130.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          UNNotificationSettings.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?)   {
    when (value) {
      is Notification -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is RemoteMessage -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      is UNNotificationSettings -> {
        stream.write(130)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/** Generated class from Pigeon that represents Flutter messages that can be called from Kotlin. */
@Suppress("UNCHECKED_CAST")
class PushFlutterApi(private val binaryMessenger: BinaryMessenger) {
  companion object {
    /** The codec used by PushFlutterApi. */
    val codec: MessageCodec<Any?> by lazy {
      PushFlutterApiCodec
    }
  }
  fun onMessage(messageArg: RemoteMessage, callback: (Result<Unit>) -> Unit) {
    val channelName = "dev.flutter.pigeon.push_platform_interface.PushFlutterApi.onMessage"
    val channel = BasicMessageChannel<Any?>(binaryMessenger, channelName, codec)
    channel.send(listOf(messageArg)) {
      if (it is List<*>) {
        if (it.size > 1) {
          callback(Result.failure(FlutterError(it[0] as String, it[1] as String, it[2] as String?)))
        } else {
          callback(Result.success(Unit))
        }
      } else {
        callback(Result.failure(createConnectionError(channelName)))
      } 
    }
  }
  fun onBackgroundMessage(messageArg: RemoteMessage, callback: (Result<Unit>) -> Unit) {
    val channelName = "dev.flutter.pigeon.push_platform_interface.PushFlutterApi.onBackgroundMessage"
    val channel = BasicMessageChannel<Any?>(binaryMessenger, channelName, codec)
    channel.send(listOf(messageArg)) {
      if (it is List<*>) {
        if (it.size > 1) {
          callback(Result.failure(FlutterError(it[0] as String, it[1] as String, it[2] as String?)))
        } else {
          callback(Result.success(Unit))
        }
      } else {
        callback(Result.failure(createConnectionError(channelName)))
      } 
    }
  }
  /**
   * Unfortunately, the intent provided to the app when a user taps on a
   * notification does not include notification's title or body.
   * In this instance, it makes more sense to remove this useful functionality from iOS too.
   * Only the data property on the RemoteMessage is returned to the user.
   * This is effectively the lowest common denominator API.
   *
   * Hint: You can still include the title, body or other metadata in your
   * data payload to identify what notification the user tapped on.
   */
  fun onNotificationTap(dataArg: Map<String?, Any?>, callback: (Result<Unit>) -> Unit) {
    val channelName = "dev.flutter.pigeon.push_platform_interface.PushFlutterApi.onNotificationTap"
    val channel = BasicMessageChannel<Any?>(binaryMessenger, channelName, codec)
    channel.send(listOf(dataArg)) {
      if (it is List<*>) {
        if (it.size > 1) {
          callback(Result.failure(FlutterError(it[0] as String, it[1] as String, it[2] as String?)))
        } else {
          callback(Result.success(Unit))
        }
      } else {
        callback(Result.failure(createConnectionError(channelName)))
      } 
    }
  }
  fun onNewToken(tokenArg: String, callback: (Result<Unit>) -> Unit) {
    val channelName = "dev.flutter.pigeon.push_platform_interface.PushFlutterApi.onNewToken"
    val channel = BasicMessageChannel<Any?>(binaryMessenger, channelName, codec)
    channel.send(listOf(tokenArg)) {
      if (it is List<*>) {
        if (it.size > 1) {
          callback(Result.failure(FlutterError(it[0] as String, it[1] as String, it[2] as String?)))
        } else {
          callback(Result.success(Unit))
        }
      } else {
        callback(Result.failure(createConnectionError(channelName)))
      } 
    }
  }
  fun onOpenNotificationSettings(callback: (Result<Unit>) -> Unit) {
    val channelName = "dev.flutter.pigeon.push_platform_interface.PushFlutterApi.onOpenNotificationSettings"
    val channel = BasicMessageChannel<Any?>(binaryMessenger, channelName, codec)
    channel.send(null) {
      if (it is List<*>) {
        if (it.size > 1) {
          callback(Result.failure(FlutterError(it[0] as String, it[1] as String, it[2] as String?)))
        } else {
          callback(Result.success(Unit))
        }
      } else {
        callback(Result.failure(createConnectionError(channelName)))
      } 
    }
  }
}
