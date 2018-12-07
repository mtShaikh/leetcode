[org 0x0100]
            jmp _start

data: dw -1, 8, 0, 2, 0, -5, -1, -9, -9

_start:
    mov ax, data ; send start of array in bx
    push ax
    mov ax, 9 ; send count of elements in cx
    push ax
    call insertionsort ; call our subroutine
    mov ax, 0x4c00 ; terminate program
    int 0x21


insertionsort:
    %define a [bp + 4]
    %define n [bp + 2]
    mov bp, sp
    pusha
    mov cx, 0
    mov si, 0
    outerloop:
        mov bx, cx
        imul bx, 2
        add bx, a
        mov si, [bx]
        mov ax, bx
        mov dx, cx
        dec dx
        innerLoop:
            cmp dx, 0
            jl quitLoop
            mov ax, bx
            mov bx, dx
            imul bx, 2
            add bx, a
            cmp si, [bx]
            jl quitLoop ;change condition for asc
            mov di, [bx]
            mov [bx + 2], di
            dec dx
            jmp innerLoop
        quitLoop:
            cmp cx, 2
            jge saveState
            jmp returnState

        saveState:
            mov bx, ax
            jmp returnState

        returnState:
            mov [bx], si
            inc cx
            cmp cx, n
            jl outerloop
    popa
    ret

