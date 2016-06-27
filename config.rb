Encoding.default_external = "utf-8"

# Require any additional compass plugins here.

# Set this to the root of your project when deployed:
http_path = "/"
fonts_dir = "/resources/public/fonts"
http_fonts_path = "/public/fonts"
css_dir = "resources/public/css"
sass_dir = "resources/sass/public"
add_import_path "resources/sass"
images_dir = "resources/public/images"
generated_images_dir = "resources/public/images/sprites"
http_images_dir = "images/sprites"

# You can select your preferred output style here (can be overridden via the command line):
# output_style = :expanded or :nested or :compact or :compressed
output_style = :compressed

# To enable relative paths to assets via compass helper functions. Uncomment:
# relative_assets = true

# To disable debugging comments that display the original location of your selectors. Uncomment:
# line_comments = false
line_comments = false

preferred_syntax = :sass

chunky_png_options = :best_compression
disable_warnings = true

def remove_metadata(filename)
    system "mogrify -strip #{filename}"
    return filename
end

def compress_image(filename)
    system "pngquant --quality=88-94 --speed 1 --force --ext \".png\" #{filename} #{filename}"
    system "convert -quality 100 +dither -depth 8 #{filename} #{filename}"
    return filename
end

on_sprite_saved do |filename|
    return filename unless File.exists? filename

    remove_metadata filename
    compress_image filename
end
