import java.nio.file.Files
import java.nio.file.Paths

fun datapack(version: String, name: String) {
    println("Creating \"$name\" datapack for $version")
    //Generate folders
    Files.createDirectory(Paths.get(name))
    Files.createDirectory(Paths.get("$name/data/"))
    Files.createDirectory(Paths.get("$name/data/minecraft/"))
    Files.createDirectory(Paths.get("$name/data/minecraft/advancements"))
    Files.createDirectory(Paths.get("$name/data/minecraft/dimension"))
    Files.createDirectory(Paths.get("$name/data/minecraft/dimension_type"))
    Files.createDirectory(Paths.get("$name/data/minecraft/functions"))
    Files.createDirectory(Paths.get("$name/data/minecraft/loot_tables"))
    Files.createDirectory(Paths.get("$name/data/minecraft/predicates"))
    Files.createDirectory(Paths.get("$name/data/minecraft/recipes"))
    Files.createDirectory(Paths.get("$name/data/minecraft/structures"))
    Files.createDirectory(Paths.get("$name/data/minecraft/tags"))
    Files.createDirectory(Paths.get("$name/data/minecraft/worldgen"))
    Files.createDirectory(Paths.get("$name/data/minecraft/worldgen/biome"))
    Files.createDirectory(Paths.get("$name/data/minecraft/worldgen/configured_carver"))
    Files.createDirectory(Paths.get("$name/data/minecraft/worldgen/configured_feature"))
    Files.createDirectory(Paths.get("$name/data/minecraft/worldgen/configured_structure_feature"))
    Files.createDirectory(Paths.get("$name/data/minecraft/worldgen/configured_surface_builder"))
    Files.createDirectory(Paths.get("$name/data/minecraft/worldgen/noise_settings"))
    Files.createDirectory(Paths.get("$name/data/minecraft/worldgen/processor_list"))
    Files.createDirectory(Paths.get("$name/data/minecraft/worldgen/template_pool"))
    //Generate mcmeta
    val file = "$name/pack.mcmeta"
    Files.createFile(Paths.get(file))
    when (version) {
        "1.19" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 10,\n            \"description\": \"Custom Data Pack\"\n    }\n}\n"
            )
        }
        "1.18" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 9,\n            \"description\": \"Custom Data Pack\"\n    }\n}\n"
            )
        }
        "1.17" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 7,\n            \"description\": \"Custom Data Pack\"\n    }\n}\n"
            )
        }
        "1.16" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 6,\n            \"description\": \"Custom Data Pack\"\n    }\n}\n"
            )
        }
        "1.15" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 5,\n            \"description\": \"Custom Data Pack\"\n    }\n}\n"
            )

        }
        "1.14" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 4,\n            \"description\": \"Custom Data Pack\"\n    }\n}\n"
            )
        }
        "1.13" -> {
            Files.writeString(Paths.get(file),
                "{    \n        \"pack\": {\n            \"pack_format\": 4,\n            \"description\": \"Custom Data Pack\"\n    }\n}\n"
            )
        }

    }
}