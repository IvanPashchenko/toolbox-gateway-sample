package toolbox.gateway.sample

import com.jetbrains.toolbox.gateway.RemoteEnvironmentPropertiesConsumer
import com.jetbrains.toolbox.gateway.RemoteProviderEnvironment
import com.jetbrains.toolbox.gateway.environments.EnvironmentContentsView
import com.jetbrains.toolbox.gateway.environments.ManualEnvironmentContentsView
import java.util.concurrent.CompletableFuture

class SampleRemoteEnvironment(
    private val environment: EnvironmentDTO
) : RemoteProviderEnvironment {
    override fun getId(): String = environment.id
    override fun getName(): String = environment.name

    override fun addStateListener(consumer: RemoteEnvironmentPropertiesConsumer) {
    }

    override fun removeStateListener(consumer: RemoteEnvironmentPropertiesConsumer) {
    }

    override fun getContentsView(): CompletableFuture<EnvironmentContentsView> {
        return CompletableFuture.completedFuture(SampleEnvironmentContentsView())
    }

    override fun setVisible(p0: Boolean, p1: Boolean) {

    }
}