package erikgabriel.nearby.ui.component.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import erikgabriel.nearby.R
import erikgabriel.nearby.ui.theme.Typography

@Composable
fun WelcomeHeader(modifier: Modifier = Modifier) {
    Column(modifier = Modifier, verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.img_logo_logo_icon),
            contentDescription = "Nearby App Logo",
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Bem-vindo ao Nearby",
            style = Typography.headlineLarge
        )
        Text(
            text = "Tenha cupons de vantagens para usar em seus estabelecimentos favoritos.",
            style = Typography.bodyLarge
        )
    }
}
