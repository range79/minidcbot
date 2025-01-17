# Discord Bot Example

## Açıklama
Bu proje, Java ve Kotlin kullanarak basit bir Discord botu oluşturmak için bir örnektir. Bot, belirli etkinliklere yanıt veren dinleyiciler içerir ve kolayca genişletilebilir bir yapıya sahiptir.

---

## Gereksinimler

- **Java JDK 11 veya üzeri**
- **Maven 3.6 veya üzeri**
- **Discord Bot Token** (Bu token'i [Discord Developer Portal](https://discord.com/developers/applications) üzerinden oluşturabilirsiniz.)

---

## Kurulum Adımları

### 1. Projeyi Klonlayın
```bash
git clone <proje-repo-linki>
cd DiscordBotExample
```

### 2. Gereksinimleri Yükleyin
Maven bağımlılıklarını indirin:
```bash
mvn clean install
```

### 3. Bot Token'inizi Ekleyin
Projedeki `Variables.kt` dosyasını açın ve `TOKEN` değişkenine Discord bot token'inizi ve selamlama kanali tokeninizi ve 
botplayingede bot oynuyor kismina ne eklemek istediginiz ekleyin:
```kotlin
 val TOKEN = "BOT_TOKENİNİZ"
 val botToken:String =""
 val botplaying:String =""
```

### 4. Botu Çalıştırın
Botu başlatmak için Maven kullanın:
```bash
mvn exec:java -Dexec.mainClass="com.range.Main"
```

---

## Özellikler

- **Üye Sayaç Dinleyicisi**: Sunucunuzdaki üye sayılarını dinler ve gerektiğinde günceller. (Dosya: `MemberCounter.java`)
- **Mesaj Dinleyicisi**: Gelen mesajlara yanıt verir. (Dosya: `MessageListener.java`)

---

## Katkıda Bulunma

1. Bu projeyi forklayın.
2. Yeni bir özellik veya düzeltme için bir branch oluşturun.
3. Branch'inize kodunuzu ekleyip test edin.
4. Pull request gönderin!
