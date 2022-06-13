import java.nio.file.Files
import java.nio.file.Paths

fun resourcepack(version: String, name: String) {
    println("Creating \"$name\" resourcepack for $version")
    Files.createDirectory(Paths.get(name))
    Files.createDirectory(Paths.get("$name/assets/"))
    Files.createDirectory(Paths.get("$name/assets/minecraft"))
    Files.createDirectory(Paths.get("$name/assets/realms"))
    Files.createDirectory(Paths.get("$name/assets/realms/textures"))
    Files.createDirectory(Paths.get("$name/assets/realms/textures/gui/"))
    Files.createDirectory(Paths.get("$name/assets/realms/textures/gui/realms"))
    Files.createDirectory(Paths.get("$name/assets/realms/textures/gui/title"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/bockstates"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/lang"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/models"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/models/block"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/models/item"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/optifine"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/shaders"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/shaders/post"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/shaders/program"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/sounds"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/sounds/item"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/sounds/mod"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/sounds/random"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/texts"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/block"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/block_alt"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/colormap"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/entity"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/entity_alt"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/environment"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/font"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/gui"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/item"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/item_alt"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/map"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/misc"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/mob_effect"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/models"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/particle"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/textures/painting"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/optifine/cit"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/optifine/cem"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/optifine/colormap"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/optifine/ctm"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/optifine/gui"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/optifine/line"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/optifine/mob"))
    Files.createDirectory(Paths.get("$name/assets/minecraft/optifine/sky"))
    val file = "$name/pack.mcmeta"
    Files.createFile(Paths.get(file))
    when (version) {
        "1.19" -> {
            Files.writeString(Paths.get(file),
            "{    \n        \"pack\": {\n            \"pack_format\": 8,\n            \"description\": \"Custom Resource Pack\"\n    }\n}\n"
                    )
        }
        "1.18" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 7,\n            \"description\": \"Custom Resource Pack\"\n    }\n}\n"
            )
        }
        "1.17" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 6,\n            \"description\": \"Custom Resource Pack\"\n    }\n}\n"
            )
        }
        "1.16" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 5,\n            \"description\": \"Custom Resource Pack\"\n    }\n}\n"
            )
        }
        "1.15" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 4,\n            \"description\": \"Custom Resource Pack\"\n    }\n}\n"
            )
        }
        "1.14" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 3,\n            \"description\": \"Custom Resource Pack\"\n    }\n}\n"
            )
        }
        "1.13" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 2,\n            \"description\": \"Custom Resource Pack\"\n    }\n}\n"
            )
        }
        "1.12" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 1,\n            \"description\": \"Custom Resource Pack\"\n    }\n}\n"
            )
        }
    }
}


