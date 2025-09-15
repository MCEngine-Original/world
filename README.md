# ℹ️ Information

This is a SpigotMC plugin created as a test before building the full engine. ⚙️

# 🎯 Objective

The project stores Minecraft worlds in a database, not as full files.  
Each chunk is stored as a separate row, and the system maps them back together when loading. 🧩  
The goal is to keep worlds entirely in the database, while still loading physical files to the server when needed. 💾

# 🌍 How It Works

If a world does not exist, the plugin will automatically generate a skyblock world for the player. ☁️  
This primary world cannot be deleted and its ownership cannot be changed directly. 🚫👑  
Ownership transfer is possible through a trade system, but **not for the primary world**.  
Players can still own multiple worlds. 🔄🌐

# ⚠️ Important

This project is for **testing purposes only** and will not receive fixes or maintenance in the future. 🧪  
The main project can be found here: [MCEngine World](https://github.com/MCEngine-Engine/world) 🌐
