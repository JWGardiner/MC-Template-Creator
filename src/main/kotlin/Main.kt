import java.awt.GridLayout
import javax.swing.*

fun main() {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
    JFrame().also { window ->
        window.title = "JWG Resource Pack Generator"
        window.setSize(800, 500)
        window.layout = GridLayout(3,6)
        window.setLocationRelativeTo(null)
        (1..3).map {
            when (it) {
                1 -> {
                    JButton("Resource Pack Generator").also { button ->
                        button.addActionListener {
                            val version: String = JOptionPane.showInputDialog(
                                "Minecraft Version:", null
                            )
                            val name: String = JOptionPane.showInputDialog(
                                "Pack Name:", null
                            )
                            resourcepack(version, name)
                        }
                    }
                }
                2 -> {
                    JButton("Data Pack Generator").also { button ->
                        button.addActionListener {
                            datapack()
                        }
                    }
                }
                else -> JButton("Fabric Template Downloader").also { button ->
                    button.addActionListener {
                        fabricmod()
                    }
                }
            }
            }.forEach(window::add)
        window.isVisible = true
        }

}
